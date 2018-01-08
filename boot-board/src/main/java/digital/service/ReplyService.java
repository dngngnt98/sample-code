package digital.service;

import java.util.List;

import digital.domain.Reply;

public interface ReplyService {
	public List<Reply> list(Integer boardNo);
	public void insert(Reply reply);
	public void update(Reply reply);
	public void delete(Integer replyNo);
}
