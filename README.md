# My Test PDF Project
โปรเจกต์สำหรับทดสอบการสร้าง PDF ด้วย JasperReports ผ่าน Spring Boot API

## ความต้องการของระบบ (Prerequisites)
* Java 8 (หรือ Java 17 ตามความเหมาะสม)
* Maven 3.x
* Jaspersoft Studio (สำหรับแก้ไขไฟล์ .jrxml)# my-test-pdf

## วิธีการรันโปรเจกต์
1. Clone โปรเจกต์ไปที่เครื่อง
2. สั่ง Build ด้วย Maven:
   ```bash
   mvn clean package
3. เปิด cmd 
4. cd C:\{pathที่วางไฟล์jar}
5. พิมพ์ java -jar target/my-rest-api-0.0.1-SNAPSHOT.jar จากนั้นกด enter

### ข้อแนะนำ 
"หากเจอ Error `UnsupportedClassVersionError` ให้เช็กว่าใช้ Java 17 ในการรัน"
