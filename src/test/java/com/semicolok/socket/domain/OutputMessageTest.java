package com.semicolok.socket.domain;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class OutputMessageTest {
	@Test
	public void getTime() throws Exception {
		OutputMessage outputMessage = new OutputMessage();
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<OutputMessage>> set = validator.validate(outputMessage);
		for (Iterator<ConstraintViolation<OutputMessage>> iterator = set.iterator(); iterator.hasNext(); ) {
			ConstraintViolation<OutputMessage> next = iterator.next();
			System.out.println(next.getConstraintDescriptor());
			System.out.println(next.getExecutableParameters());
			System.out.println(next.getInvalidValue());
			System.out.println(next.getLeafBean());
			System.out.println(next.getMessageTemplate());
			System.out.println(next.getMessage());
		}
		Val
	}

}