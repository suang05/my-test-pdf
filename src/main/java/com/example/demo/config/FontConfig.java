package com.example.demo.config;

import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JasperReportsContext;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

import java.util.logging.Logger;

@Configuration
public class FontConfig {

    private static final Logger logger = Logger.getLogger(FontConfig.class.getName());

    @PostConstruct
    public void init() {
        // ดึง Context หลักของ JasperReports
        JasperReportsContext jasperReportsContext = DefaultJasperReportsContext.getInstance();
        
        // บังคับให้ Jasper ตรวจสอบ Font Extensions ใน Classpath
        // ปกติถ้าเราใส่ไฟล์ .jar ของ Font ไว้ใน Dependencies มันจะโหลดให้อัตโนมัติ
        // แต่การทำ Log ไว้จะช่วยให้เรามั่นใจตอน Debug ครับ
        
        logger.info("=== JasperReports Font Configuration Initialized ===");
        
        // ตรวจสอบว่ามี Property ของ Font Extension อยู่ไหม
        String fontFactory = jasperReportsContext.getProperty("net.sf.jasperreports.extension.registry.factory.fonts");
        
        if (fontFactory != null) {
            logger.info("Font Extension Registry Factory found: " + fontFactory);
        } else {
            logger.warning("Warning: No JasperReports Font Extension Factory detected!");
            logger.warning("ตรวจสอบว่าได้เพิ่มไฟล์ th-sarabun-font.jar เข้าไปใน Build Path หรือยัง");
        }
    }
}