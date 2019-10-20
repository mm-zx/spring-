package ren.improve.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CaingImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// ¥Ê∑≈¿‡¬∑æ∂
		return new String[] {"ren.improve.cap6.bean.Cat"};
	}

}
