package com.jronell.service;

import java.util.List;

import com.jronell.model.BucketListItem;

public interface BucketListService {
	
	public List<BucketListItem> getUserBucketList(int userId);
	
	public void deleteItemInBucketList(int itemId);
	
	public void addItemInBucketList(BucketListItem BucketList);
	
	
	
}
