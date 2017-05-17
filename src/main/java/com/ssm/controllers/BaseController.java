package com.ssm.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

public class BaseController {
	protected Locale locale = LocaleContextHolder.getLocale();
	@Autowired
	protected MessageSource messageSource;
}
