# InterviewCode 
Problem Statement 
Create a REST API which accepts a gender name and returns a list of users in the organization with that gender. 
Sample Request: 
{ 
"gender": "female" 
}



Business Logic: 
You have an internal API in your organization which returns the user details. You need to retrieve it using the query -> https://randomuser.me/api/?format=json&gender=female 
Retrieve the gender name you got from the request and pass it to the above API request. Once you get the details, extract the first & last names (results > name > first). Now prefix the name with “WeXL” phrase and send it back to the client 


Sample Response:
{"results":[{"gender":"female","name":{"title":"Ms","first":"WeXLSelma","last":"WeXLSørensen"},"location":{"street":{"number":6221,"name":"Skivevej"},"city":"København S","state":"Danmark","country":"Denmark","postcode":12391,"coordinates":{"latitude":"-27.3307","longitude":"114.2171"},"timezone":{"offset":"+5:45","description":"Kathmandu"}},"email":"selma.sorensen@example.com","login":{"uuid":"feb9b600-b919-4ffb-9ef9-08d8849e18f9","username":"yellowmeercat112","password":"tupac","salt":"TLfJ87SL","md5":"a42666e97515ace3be48deb5b976476c","sha1":"f091af62918a9ee02a45793a90c3a07956ee3e5e","sha256":"5eed5f8458bb725dec7c16f4bed4fecaa47e5b0c9025bfb6cf6a95f4a4a643a5"},"dob":{"date":"1972-08-29T07:02:53.384Z","age":49},"registered":{"date":"2017-05-30T09:44:20.731Z","age":4},"phone":"52590595","cell":"76748370","id":{"name":"CPR","value":"290872-0312"},"picture":{"large":"https://randomuser.me/api/portraits/women/54.jpg","medium":"https://randomuser.me/api/portraits/med/women/54.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/54.jpg"},"nat":"DK"}],"info":{"seed":"3811866cc42610df","results":1,"page":1,"version":"1.3"}}

