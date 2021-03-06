package logGenerator.logGenerating.randomGenerators;

import java.util.Random;

import logGenerator.logFileRecord.RequestInfo;
import logGenerator.logGenerating.randomGenerators.RandomHttpRequstTypeGenerator;

public class RandomRequestInfoGenerator {
	private Random rnd;
	
	public RandomRequestInfoGenerator(Random rnd) {
		super();
		this.rnd = rnd;
	}

	public RequestInfo generate(){
		RequestInfo reqInfo = new RequestInfo();
		
		reqInfo.setProtocol(new RandomProtocolGenerator(rnd).generate());
		String [] fileNameArr = new String[]{"/index.html", "/guest.html", "/contacts.html", "/img/picture.jpg", "/script/script.js"};
		reqInfo.setRequestedSource((String)new ProbabyilityGenerator(rnd).generate(fileNameArr));
		reqInfo.setRequestType(new RandomHttpRequstTypeGenerator(rnd).generate()); 
		
		return reqInfo;
	}
}
