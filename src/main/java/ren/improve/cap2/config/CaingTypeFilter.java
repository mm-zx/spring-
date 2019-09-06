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
	 * metadataReader:��ȡ����ǰ����ɨ�������Ϣ metadataReaderFactory�����Ի�ȡ�������κ�����Ϣ
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// TODO Auto-generated method stub
		// ��ȡ��ǰ��ע�����Ϣ
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		// ��ȡ��ǰ����ɨ�������Ϣ
		ClassMetadata = metadataReader.getClassMetadata();
		// ��ȡ��ǰ����Դ(���·��)
		Resource resource = metadataReader.getResource();
		String className = ClassMetadata.getClassName();
		System.out.println("---->" + className);

		if (className.contains("er")) {//�������er�ַ�����ƥ��ɹ�������true
			return true;
		}

		return false;
	}

}
