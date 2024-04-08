package com.gurman.interview.group.by.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.gurman.interview.model.BlogPost;
import com.gurman.interview.model.BlogPostType;

public class GroupByCompositeKey_2 {

	public static void main(String[] args) {
		List<BlogPost> posts = Arrays.asList(new BlogPost("title1", "author1", BlogPostType.GUIDE, 1),
				new BlogPost("title1", "author1", BlogPostType.GUIDE, 3),
				new BlogPost("title2", "author2", BlogPostType.NEWS, 3),
				new BlogPost("title3", "author3", BlogPostType.REVIEW, 3),
				new BlogPost("title4", "author1", BlogPostType.GUIDE, 1),
				new BlogPost("title5", "author2", BlogPostType.NEWS, 1),
				new BlogPost("title6", "author2", BlogPostType.REVIEW, 1),
				new BlogPost("title7", "author3", BlogPostType.GUIDE, 2),
				new BlogPost("title8", "author3", BlogPostType.NEWS, 2),
				new BlogPost("title9", "author1", BlogPostType.REVIEW, 2));
		System.out.println(groupByCompositeKey(posts));

	}

	private static Map<Tuple, Set<BlogPost>> groupByCompositeKey(List<BlogPost> posts) {
		return posts.stream().collect
				(Collectors.groupingBy(post -> new Tuple(post.getAuthor(), post.getType()),Collectors.toSet()));
	}

}

class Tuple {
	private String author;
	private BlogPostType type;

	public Tuple(String author, BlogPostType type) {
		super();
		this.author = author;
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BlogPostType getType() {
		return type;
	}

	public void setType(BlogPostType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tuple [author=" + author + ", type=" + type + "]";
	}

}
