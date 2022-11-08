# Spring Boot Device

## Endpoints

### Sign-Up

....
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"name":"admin",
"username":"admin",
"password": "admin"
}
....

### Sign-In

....
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"username":"admin",
"password":"admin"
}
....

### Change-Role

....
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjo2LCJleHAiOjE2Njc5NDE2Mzh9.2ncMt5yvHrYOH8p-qUbVwEHBh2qBp4jUTty8IWq0RU0cGbusbhbW9QYM3mGiDl3JrQ9pk9in6rvv43mRFqdVpg
....

### Save Device

....
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjY3OTQyMTQwfQ.Pf5lH_a9jaaVnVbJC03sCBUAQfwA9R4P6cZgBRNxAze7KDrWMq1MJS7UYmHEvAyDtCwmZd20IHojDuNKWu2nIQ
Content-Type: application/json

{
"name": "device-2",
"description": "desc-2",
"price": 10,
"deviceType": "DESKTOP"
}
....

### Get All Devices

....
GET /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjY3OTQyMTQwfQ.Pf5lH_a9jaaVnVbJC03sCBUAQfwA9R4P6cZgBRNxAze7KDrWMq1MJS7UYmHEvAyDtCwmZd20IHojDuNKWu2nIQ
....

### Delete Device

....
DELETE /api/device/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjY3OTQyMTQwfQ.Pf5lH_a9jaaVnVbJC03sCBUAQfwA9R4P6cZgBRNxAze7KDrWMq1MJS7UYmHEvAyDtCwmZd20IHojDuNKWu2nIQ
....

### Save Purchase

....
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjY3OTQyMTQwfQ.Pf5lH_a9jaaVnVbJC03sCBUAQfwA9R4P6cZgBRNxAze7KDrWMq1MJS7UYmHEvAyDtCwmZd20IHojDuNKWu2nIQ
Content-Type: application/json

{
"userId": 6,
"deviceId": 1,
"price": 9,
"color": "blue"
}
....

### Get All Purchases

....
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjY3OTQyMTQwfQ.Pf5lH_a9jaaVnVbJC03sCBUAQfwA9R4P6cZgBRNxAze7KDrWMq1MJS7UYmHEvAyDtCwmZd20IHojDuNKWu2nIQ
....
