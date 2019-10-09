package com.dxc.training.dao;

import java.util.List;

import com.dxc.training.model.Training;

public interface TrainingDAO {
	public List<Training> getAllDetails();

	public void getOneByOne();
}
