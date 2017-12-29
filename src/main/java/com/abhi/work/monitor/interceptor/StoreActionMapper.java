package com.abhi.work.monitor.interceptor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpMethod;

public class StoreActionMapper {

	public static final int MIN_OCCURENCE = 1;
	public static final int MAX_OCCURENCE = 30;
	// Regular Expression for an alpha-numeric String.
	public static final String ALPHA_NUMERIC_PATTERN = "[a-zA-Z0-9]{" + MIN_OCCURENCE + "," + MAX_OCCURENCE + "}";

	// Regular Expression for an alphabetic String.
	public static final String ALPHA_PATTERN = "[a-zA-Z]{" + MIN_OCCURENCE + "," + MAX_OCCURENCE + "}";
	public static final String NUMERIC_PATTERN = "[0-9]{" + MIN_OCCURENCE + "," + MAX_OCCURENCE + "}";

	public static final String ITEM_CREATE_URI_PATTERN = "/store/item";
	public static final String ITEM_UPDATE_URI_PATTERN = "/store/item" + ALPHA_NUMERIC_PATTERN;
	public static final String ITEM_DELETE_URI_PATTERN = "/store/item" + ALPHA_NUMERIC_PATTERN;
	public static final String ITEM_RETRIEVE_URI_PATTERN = "/store/item";

	private static Map<String , Map<String , StoreActionType>> uriMap = new HashMap<>();
	private static Map<String , StoreActionType> storeGetMethodMap = new HashMap<>();
	private static Map<String , StoreActionType> storePostMethodMap = new HashMap<>();
	private static Map<String , StoreActionType> storePutMethodMap = new HashMap<>();
	private static Map<String , StoreActionType> storeDeleteMethodMap = new HashMap<>();

	@PostConstruct
	public void initializeActionMaps() {
		storeGetMethodMap.put(ITEM_RETRIEVE_URI_PATTERN, StoreActionType.RETRIEVE_ITEM);
		storePostMethodMap.put(ITEM_CREATE_URI_PATTERN, StoreActionType.ITEM_CREATION);
		storePutMethodMap.put(ITEM_UPDATE_URI_PATTERN, StoreActionType.UPDATE_ITEM);
		storeDeleteMethodMap.put(ITEM_DELETE_URI_PATTERN, StoreActionType.DELETE_ITEM);
		uriMap.put(HttpMethod.GET.name(), storeGetMethodMap);
		uriMap.put(HttpMethod.POST.name(), storePostMethodMap);
		uriMap.put(HttpMethod.PUT.name(), storePutMethodMap);
		uriMap.put(HttpMethod.DELETE.name(), storeDeleteMethodMap);
	}


	public String getRequestURI(HttpServletRequest request) {
		String context = request.getContextPath();
		String completeUri = request.getRequestURI();
		String absoluteUri = completeUri.substring(context.length(),completeUri.length());
		return absoluteUri;
	}

	public StoreActionType getStoreActionType(String httpMehod , Predicate<String> predicate) {
		
			for( Map.Entry<String, StoreActionType> entry :   uriMap.get(httpMehod).entrySet()) {
				if(predicate.test(entry.getKey())) {
					return entry.getValue();
				}
			}
			return null;
	}
		

	@PreDestroy
	public void flushMaps() {
		uriMap = null;
		storeDeleteMethodMap = null;
		storePutMethodMap = null;
		storePostMethodMap = null;
		storeGetMethodMap = null;

	}
	
	

}
