Suggested Answer for:
======================

git clone

cd q38716703

mvn clean install

mvn spring-boot:run&

curl -X POST http://127.0.0.1:8080/v1.0/login?id=name&pw=name

C:\workspace\q38716703\src\main\resources>keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass password -validity 360 -keysize 4096
What is your first and last name?
  [Unknown]:  localhost
What is the name of your organizational unit?
  [Unknown]:  Stackoverflow
What is the name of your organization?
  [Unknown]:  Stackoverflow
What is the name of your City or Locality?
  [Unknown]:  Boston
What is the name of your State or Province?
  [Unknown]:  Massachusetts
What is the two-letter country code for this unit?
  [Unknown]:  US
Is CN=localhost, OU=Stackoverflow, O=Stackoverflow, L=Boston, ST="Massachusetts ", C=US correct?
  [no]:  yes

Enter key password for <selfsigned>
        (RETURN if same as keystore password):
Re-enter new password:

Password=123456

keytool -export -alias selfsigned -keystore keystore.jks -rfc -file X509_certificate.cer



