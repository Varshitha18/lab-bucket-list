package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.TouristPlace;

public class SetOperations {
	Set<TouristPlace> bucketSet = new HashSet<TouristPlace>(); 
	public Set<TouristPlace> add(TouristPlace places) {
		bucketSet.add(places);
		return bucketSet;
	}
	public Set<TouristPlace> remove(TouristPlace places) {
		bucketSet.remove(places);
		return bucketSet;
	}
	public Object sortByDestination(Set<TouristPlace> places) {
		ArrayList<TouristPlace> slist=new ArrayList<TouristPlace>();
		slist.sort((TouristPlace placeA,TouristPlace placeB) -> placeA.getDestination().compareTo(placeB.getDestination()));
		return slist;
	}
	public Object sortByRank(Set<TouristPlace> places) {
		ArrayList<TouristPlace> slist=new ArrayList<TouristPlace>();
		slist.sort((TouristPlace placeA,TouristPlace placeB) -> placeA.getRank().compareTo(placeB.getRank()));
		return slist;
	}
	public Object reset(Set<TouristPlace> places) {
		places.clear();
		return places;
	}
}