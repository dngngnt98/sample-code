package digital.service.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import digital.service.UploadService;
import digital.utils.FileSystem;

@Service
public class UploadServiceImpl implements UploadService {

  private final static String DIR = "c:/webupload/";

  @Override
  public String fileUpload(MultipartFile file, String newFileName) throws Exception {
    FileSystem fileSystem = new FileSystem();
    if (file.isEmpty()) {
      return null;
    }
    // 프로젝트 파일의 경로
    // String realPath = session.getServletContext().getRealPath(PATH3);
    String fileName = file.getOriginalFilename();
    String type = fileSystem.fileFormat(fileName);
    File filePath = new File(DIR + newFileName);
    // 자 디렉토리 별 처리를 한번 해봅시다!!
    // 예상되는 경로는 위의 경로들 자 이 디렉토리들을 케이스문으로 처리하느냐
    // 아니면 걍 이프문으로 처리 하느냐....

    // 파일의 경로로 파일 날려줌
    file.transferTo(filePath);
    // 확장자가 이미지 파일이면
    if (fileSystem.getMediaType(type) != null) {
      // 썸네일 파일 생성
      BufferedImage sourceImg = ImageIO.read(new File(DIR + newFileName));
      BufferedImage thumbImg = new BufferedImage(300, 300, BufferedImage.TYPE_3BYTE_BGR);
      Graphics2D graphic = thumbImg.createGraphics();
      graphic.drawImage(sourceImg, 0, 0, 300, 300, null);
      String thumbName = DIR + fileSystem.thumbName() + "." + type;
      File thumbNail = new File(thumbName);
      ImageIO.write(thumbImg, type.toUpperCase(), thumbNail);
      return thumbName;
    }
    return newFileName;
  }

}
