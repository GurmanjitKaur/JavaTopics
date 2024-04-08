package com.gurman.interview.group.by.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.gurman.interview.model.BlogPost;
import com.gurman.interview.model.BlogPostType;

public class GroupBy_Sum_SortByValue_4 {

	public static void main(String[] args) {
		List<BlogPost> posts = Arrays.asList(new BlogPost("title1", "author1", BlogPostType.GUIDE, 1),
				new BlogPost("title1", "author1", BlogPostType.GUIDE, 0),
				new BlogPost("title2", "author2", BlogPostType.NEWS, 3),
				new BlogPost("title3", "author3", BlogPostType.REVIEW, 7),
				new BlogPost("title4", "author1", BlogPostType.GUIDE, 1),
				new BlogPost("title5", "author2", BlogPostType.NEWS, 1),
				new BlogPost("title6", "author2", BlogPostType.REVIEW, 1),
				new BlogPost("title7", "author3", BlogPostType.GUIDE, 2),
				new BlogPost("title8", "author3", BlogPostType.NEWS, 1),
				new BlogPost("title9", "author1", BlogPostType.REVIEW, 2));
		System.out.println(groupBy_Sum(posts));
		System.out.println(groupBy_Count(posts));

	}

	private static List<Entry<BlogPostType, Integer>> groupBy_Sum(List<BlogPost> posts) {
		// Sum in descending order
		return posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, 
						Collectors.summingInt(BlogPost::getLikes))).entrySet()
				.stream().sorted(Map.Entry.<BlogPostType, Integer>comparingByValue().reversed())
				.collect(Collectors.toList());
	}

	private static List<Entry<BlogPostType, Long>> groupBy_Count(List<BlogPost> posts) {
		// count in ascending order
		return posts.stream().collect(Collectors.groupingBy(BlogPost::getType, Collectors.counting())).entrySet()
				.stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
	}

}
