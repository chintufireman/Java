### Shallow Copy
1. as you can see there are two classes student and classroom

2. student has int and string value And classroom has int, string and student type Object.

3. here suppose when u create student's copy object then the new object which u created using it prev object will copy both value rollno and name into new one.

4. now when u create object again by copying old object for classroom it will copy all primitve and string type values as it is from old one but there is one data member as Student in classroom.

5. now what will happen in shallow copies case it will copy just reference id or number of object instead of copying field like suppose this object is in heap memory with some reference number mapped to field of classroom's old object.

6. then same reference number will be mapped to this newly created copy object

7. so new object's data member will get mapped to student's old object which is in heap memory

8. so if u change something inside the student's object which is in newly created object of classroom then it will also get changed in student's object which is inside the old clasroom's object.