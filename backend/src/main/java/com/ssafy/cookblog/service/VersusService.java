package com.ssafy.cookblog.service;

import java.util.List;

import com.ssafy.cookblog.dto.RecipeDto;
import com.ssafy.cookblog.dto.VersusDto;
import com.ssafy.cookblog.dto.VersusPointDto;

public interface VersusService {
	int registerVersus(VersusDto versusDto);
	int winVersus(VersusPointDto versusPoint);
}
