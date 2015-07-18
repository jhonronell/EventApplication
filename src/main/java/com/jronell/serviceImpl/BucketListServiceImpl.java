package com.jronell.serviceImpl;

import java.util.List;

import com.jronell.dao.BucketListDao;
import com.jronell.model.BucketListItem;
import com.jronell.service.BucketListService;

public class BucketListServiceImpl implements BucketListService {

	private BucketListDao bucketListDao;
	
	public void setBucketListDao(BucketListDao bucketListDao){
		this.bucketListDao = bucketListDao;
	}
	@Override
	public List<BucketListItem> getUserBucketList(int id) {
		
		return bucketListDao.getUserBucketList(id);
	}
	@Override
	public void addItemInBucketList(BucketListItem bucketList) {
		// TODO Auto-generated method stub
		bucketListDao.addItemInBucketList(bucketList);
	}
	@Override
	public void deleteItemInBucketList(int bucketListItemId) {
		// TODO Auto-generated method stub
		bucketListDao.deleteItemInBucketList(bucketListItemId);
	}
}
