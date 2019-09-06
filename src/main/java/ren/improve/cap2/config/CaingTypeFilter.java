package ren.improve.cap2.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CaingTypeFilter implements TypeFilter {
	private ClassMetadata ClassMetadata;

	/**
	 * metadataReader:读取到当前正在扫描类的信息 metadataReaderFactory：可以获取到其他任何类信息
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// TODO Auto-generated method stub
		// 获取当前类注解的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		// 获取当前正在扫描的类信息
		ClassMetadata = metadataReader.getClassMetadata();
		// 获取当前类资源(类的路径)
		Resource resource = metadataReader.getResource();
		String className = ClassMetadata.getClassName();
		System.out.println("---->" + className);

		if (className.contains("er")) {//当类包含er字符，则匹配成功，返回true
			return true;
		}

		return false;
	}

}
