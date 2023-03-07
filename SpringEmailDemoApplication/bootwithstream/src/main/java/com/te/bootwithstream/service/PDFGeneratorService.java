package com.te.bootwithstream.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.te.bootwithstream.entity.Customer;
import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.entity.Product;
import com.te.bootwithstream.repository.CustomerDAO;
import com.te.bootwithstream.repository.OrderDAO;
import com.te.bootwithstream.repository.ProductDAO;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class PDFGeneratorService {

	@Autowired
	private OrderDAO orderDAO;
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private CustomerDAO customerDAO;

	public void export(HttpServletResponse response) throws DocumentException, IOException {

		Document document = new Document(PageSize.A4);

		PdfWriter instance = PdfWriter.getInstance(document, response.getOutputStream());

		document.open();
		Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		fontTitle.setSize(18);
//****************************************************************************************************************************
		Paragraph paragraph = new Paragraph("Order_Table");
		paragraph.setAlignment(Paragraph.ALIGN_CENTER);

		Paragraph paragraph2 = new Paragraph(" ");

		PdfPTable table = new PdfPTable(4);
		PdfPCell cell = new PdfPCell(new Phrase("ID"));
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Order_Date"));
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Delivery_Date"));
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Order_Status"));
		table.addCell(cell);
		table.setHeaderRows(1);

		List<Order> findAll = orderDAO.findAll();
		findAll.stream().forEach(a -> {
			table.addCell(a.getId().toString());
			table.addCell(a.getOrderDate().toString());
			table.addCell(a.getDeliveryDate().toString());
			table.addCell(a.getStatus().toString());
		});
		// ****************************************************************************************************************************
		Paragraph paragraph3 = new Paragraph(" ");
		Paragraph paragraph1 = new Paragraph("Product_Table");
		paragraph1.setAlignment(Paragraph.ALIGN_CENTER);

		Paragraph paragraph4 = new Paragraph(" ");

		PdfPTable table1 = new PdfPTable(4);
		PdfPCell cell1 = new PdfPCell(new Phrase("ID"));
		table1.addCell(cell1);

		cell = new PdfPCell(new Phrase("Product_Name"));
		table1.addCell(cell1);

		cell = new PdfPCell(new Phrase("Procuct_Category"));
		table1.addCell(cell1);

		cell = new PdfPCell(new Phrase("Product_Price"));
		table1.addCell(cell1);
		table1.setHeaderRows(1);

		List<Product> findAll1 = productDAO.findAll();
		findAll1.stream().forEach(a -> {
			table1.addCell(a.getId().toString());
			table1.addCell(a.getName());
			table1.addCell(a.getCategory());
			table1.addCell(a.getPrice().toString());
		});
		// ****************************************************************************************************************************
		Paragraph paragraph5 = new Paragraph(" ");
		Paragraph paragraph6 = new Paragraph("Customer_Table");
		paragraph6.setAlignment(Paragraph.ALIGN_CENTER);

		Paragraph paragraph7 = new Paragraph(" ");

		PdfPTable table2 = new PdfPTable(3);
		PdfPCell cell2 = new PdfPCell(new Phrase("ID"));
		table2.addCell(cell2);

		cell = new PdfPCell(new Phrase("Name"));
		table2.addCell(cell2);

		cell = new PdfPCell(new Phrase("Tier"));
		table2.addCell(cell2);
		table2.setHeaderRows(1);

		List<Customer> findAll2 = customerDAO.findAll();
		findAll2.stream().forEach(a -> {
			table2.addCell(a.getId().toString());
			table2.addCell(a.getName());
			table2.addCell(a.getTier().toString());

		});
		document.add(paragraph);
		document.add(paragraph2);
		document.add(table);

		document.add(paragraph3);
		document.add(paragraph1);
		document.add(paragraph4);
		document.add(table1);

		document.add(paragraph5);
		document.add(paragraph6);
		document.add(paragraph7);
		document.add(table2);

		document.close();

	}
}
