package com.simplicityitself.corespringdistilled.koans

import com.simplicityitself.corespringdistilled.koans.persistence.SampleRepository
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import spock.lang.Specification;

class Koan2 extends Specification {
    def "Create an Root Spring Bean Definition"() {

        given: "You have a SampleRespository class that you want to build a Spring Bean Definition from"
        Class<SampleRepository> beanClass = SampleRepository.class;

        when: "Begin your Koan Here: Use BeanDefinitionBuilder to create a root bean definition based on the SampleRepository class"
        BeanDefinitionBuilder builder = null;

        then:
        builder != null;
        builder.getBeanDefinition().getBeanClass() == beanClass;
    }
}  
