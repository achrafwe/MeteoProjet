package com.ensim.Tp1info.Model;
import java.util.ArrayList;
import java.util.List;

public class AddressApiResponse {
	public List<Feature> features = new ArrayList<>();

	@Override
	public String toString() {
		return "AddressApiResponse{" +
				"features=" + features +
				'}';
	}



}
