package com.gurman.interview.group.by.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.gurman.interview.model.BlogPost;
import com.gurman.interview.model.BlogPostType;

public class GroupBySingleColumn_1 {

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
		System.out.println(groupBySingleColumnByType(posts));
		System.out.println("\n"+groupBySingleColumnByAuthor(posts));

	}

	private static Map<BlogPostType, List<BlogPost>> groupBySingleColumnByType(List<BlogPost> posts) {
		return posts.stream().collect(Collectors.groupingBy((BlogPost::getType)));
	}
	
	private static Map<String, List<BlogPost>> groupBySingleColumnByAuthor(List<BlogPost> posts) {
		return posts.stream().collect(Collectors.groupingBy((BlogPost::getAuthor)));
	}

}
