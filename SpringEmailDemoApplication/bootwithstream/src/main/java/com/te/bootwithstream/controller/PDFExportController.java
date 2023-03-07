package com.te.bootwithstream.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;
import com.te.bootwithstream.service.PDFGeneratorService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class PDFExportController {

	private final PDFGeneratorService generatorService;

	public PDFExportController(PDFGeneratorService generatorService) {
		super();
		this.generatorService = generatorService;
	}

	@GetMapping("/pdf/generate")
	public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");

		String currentDateTime = dateFormat.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=pdf_" + currentDateTime + ".pdf";
		response.setHeader(headerKey, headerValue);

		this.generatorService.export(response);

	}
}
