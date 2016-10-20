# tree-transfer

#### Structure

Object1

Properties | Datatype | Length
-----------|----------|----------
property1  |  string  |  1
property2  |  string  |  1
property3  |  string  |  1
property4  |  string  |  1
property5  |  string  |  1
property6  |  string  |  1
property7  |  string  |  1
property8  |  string  |  1
    
Object2

Properties  |  Datatype  |  Length
------------|------------|----------
property1   |  string    |  2
property2   |  string    |  2
property3   |  string    |  2
property4   |  string    |  2
    
Object3

Properties  |  Datatype  |  Length
------------|------------|----------
property1   |  string    |  4
property2   |  string    |  4
    
Object4

Properties  |  Datatype  |  Length
------------|------------|----------
property1   |  string    |  8

***
#### Put some text~

Object4                

Properties  |  Datatype  |  Length  |  Values
------------|------------|----------|------------
property1   |string      |8         |ABCDEFGH

==> 

Object1                

Properties  |  Datatype  |  Length  |  Values
------------|------------|----------|------------
property1   |string      |1         |A
property2   |string      |1         |B
property3   |string      |1         |C
property4   |string      |1         |D
property5   |string      |1         |E
property6   |string      |1         |F
property7   |string      |1         |G
property8   |string      |1         |H
                
Object2                

Properties  |  Datatype  |  Length  |  Values
------------|------------|----------|------------
property1   |string      |2         |AB
property2   |string      |2         |CD
property3   |string      |2         |EF
property4   |string      |2         |GH
                
Object3                

Properties  |  Datatype  |  Length  |  Values
------------|------------|----------|------------
property1   |string      |4         |ABCD
property2   |string      |4         |EFGH

