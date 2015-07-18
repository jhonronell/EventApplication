package com.jronell.dao;

import java.util.List;

import com.jronell.model.BucketListItem;

public interface BucketListDao {

	public List<BucketListItem> getUserBucketList(int id);
	
	public void addItemInBucketList(BucketListItem bucketList);
	
	public void deleteItemInBucketList(int bucketListItemId);
	
	
}
