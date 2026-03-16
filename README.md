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
3. เข้าไปที่โฟลเดอร์โปรเจกต์ผ่าน Terminal/Command Prompt
5. สั่งรันแอปพลิเคชัน:
   ```bash
   java -jar target/my-rest-api-0.0.1-SNAPSHOT.jar จากนั้นกด enter
7. ทดสอบใช้งานโดยการยิง POST ไปที่:
   ```bash
   http://localhost:8080/api/v1/documents/receipt

## ตัวอย่าง JSON
   ```bash
   {
       "customerName": "chalermchai Trithavronwong",
       "items": [
           {
               "productName": "Laptop Dell XPS 13",
               "price": 45000.00
           },
           {
               "productName": "Wireless Mouse",
               "price": 1250.00
           },
           {
               "productName": "Laptop Sleeve",
               "price": 850.00
           }
       ],
       "totalAmount": 47100.00
   }

### ข้อแนะนำ 
"หากเจอ Error `UnsupportedClassVersionError` ให้เช็กว่าใช้ Java 17 ในการรัน"
