# curd
Simple employee curd ops using Spring Boot

# Employee data format       
        
        "eid": [Type: String, "Employee ID"],
        
        "ename": [Type: String, "Employee name"],
        
        "address": [Type: String, "Employee address"],
        
        "contactno": [Type: String, "Employee contact number"]

# Usage
### Add Employee Data
Method: `POST`

url: `localhost:8080/emp`

Sample data: `{
        "eid": "w10",
        "ename": "Test Data 10",
        "address": "Kolkata",
        "contactno": "1234567890"
}`

It will add an emp data object.

`Note: It will take raw json data through POST method.`

### Update Employee Data
Method: `PUT`

url: `localhost:8080/emp`

Sample data: `{
        "eid": "w1",
        "ename": "Test 1",
        "address": "Hyd",
        "contactno": "98765432"
}`

It will update employee data if **eid** is already present in the emp data list.

`Note: It will take raw json data through PUT method.`

### Fetch Employee Data By eid
Method: `GET`

Url: `localhost:8080/emp/{eid}`

It will fetch employee data if given eid is present in emp data list.

### Fetch All Employee Data
Method: `GET`

Url: `localhost:8080/emp`

It will fetch all employee data from emp data list.

### Delete Employee Data by eid
Method: `DELETE`

Url: `localhost:8080/emp/{eid}`

It will delete employee data if given eid is present in emp data list.
