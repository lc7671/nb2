package cn.itcast.controller.converter;

import org.springframework.core.convert.converter.Converter;

public class CustomConverter implements Converter<String, String>{

	@Override
	public String convert(String source) {
		try {
			if(null!=source){
				source = source.trim();
				if(""!=source){
					return source;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
