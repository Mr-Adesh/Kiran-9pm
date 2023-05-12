package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Comment;
import com.example.demo.model.Tweet;
import com.example.demo.repository.CommentRepo;
import com.example.demo.repository.TweetRepo;

@Service
public class TweeTService {
@Autowired	
TweetRepo tweetRepo;
@Autowired
CommentRepo commentRepo;
 public String save(Tweet tweet) {
	 Comment comment1 =new Comment();
	 comment1.setText("Very well done");
	 Comment comment2 =new Comment();
	 comment2.setText("need improvisation");
	 tweet.setComments(List.of(comment1,comment2));
	 commentRepo.save(comment1);
	 commentRepo.save(comment2);
	 
	 tweetRepo.save(tweet);
	 return "SAVED";
	 
	 
 }
}
