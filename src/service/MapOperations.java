package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

class MaapOperations {
	Map<String, TouristPlace> bucketMap = new HashMap<String, TouristPlace>();
	
	public Map add(TouristPlace places) {
		bucketMap.put(places.getName(), places);
		return bucketMap;
	}
	public Map sortRandomly(HashMap places) {
		return places;
	}
	public Map sortInEntryOrder(HashMap places) {
		return places;
	}
	public Map sortAlphabetically(HashMap places) {
		Map<String, TouristPlace> map = new TreeMap<String, TouristPlace>(places);
		return map;
	}
	public Object reset(HashMap places) {
		places.clear();
		return places;
	}
	public Map remove(TouristPlace places) {
		bucketMap.remove(places.getName());
		return bucketMap;
	}
}