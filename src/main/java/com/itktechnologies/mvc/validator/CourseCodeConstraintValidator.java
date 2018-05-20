package com.itktechnologies.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		this.coursePrefix = courseCode.value();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if ( value != null) {
			
			for ( int i = 0; i < coursePrefix.length; i++) {
				
				if ( value.startsWith(this.coursePrefix[i]) ) {
					return true;
				}				
			}
			
			return false; 
			
		} else {
			// Field is not required - allow empty values
			return true;
		}
		
	}

}
