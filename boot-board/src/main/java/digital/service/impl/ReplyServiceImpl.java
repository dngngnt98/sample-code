package digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.dao.ReplyDao;
import digital.domain.Reply;
import digital.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	ReplyDao replyDao;
	
	@Override
	public List<Reply> list(Integer boardNo) {
		return replyDao.list(boardNo);
	}

	@Override
	public void insert(Reply reply) {
		replyDao.insert(reply);
	}

	@Override
	public void update(Reply reply) {
		replyDao.update(reply);
	}

	@Override
	public void delete(Integer replyNo) {
		replyDao.delete(replyNo);
	}

}
