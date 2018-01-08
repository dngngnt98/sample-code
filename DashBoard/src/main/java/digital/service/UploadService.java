package digital.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
	// 실제 파일 업로드 처리
	public String fileUpload(MultipartFile file, String newFileName) throws Exception;
}
