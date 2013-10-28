package logGenerator.logGenerating.recordformatting;

import java.util.HashMap;
import java.util.Map;

import logGenerator.logGenerating.logFileRecord.HttpRequestType;

public class HttpRequstTypeFormatter {
	private static final Map<HttpRequestType, String> reqTypeMap = reqTypeMapInit(); 
	
	private static Map<HttpRequestType, String> reqTypeMapInit(){
		Map<HttpRequestType, String> map = new HashMap<HttpRequestType, String>();
		map.put(HttpRequestType.GET, "GET");
		map.put(HttpRequestType.POST, "POST");
		return map;
	}
	
	public String format(HttpRequestType type) throws FormatException{
		if(type == null)
			throw new FormatException("Null pointer: type");
		
		StringBuilder builder = new StringBuilder();
		builder.append(reqTypeMap.get(type));
		
		return builder.toString();
	}
}
