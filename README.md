# Services Endpoint For Order Items   

# Get All Items Values

GET -  http://localhost:8200/order/items

Response : 

[
    {
        "id": 11101,
        "productCode": "CR",
        "productName": "Card Reader",
        "quantity": 9
    },
    {
        "id": 11102,
        "productCode": "PD",
        "productName": "Pen Drive",
        "quantity": 10
    },
    {
        "id": 11103,
        "productCode": "HD",
        "productName": "Hard Disk",
        "quantity": 10
    }
]

# Get Item by id

GET -  http://localhost:8200/order/item/{id}   or   http://localhost:8200/order/item/11102 

Response : 
{
    "id": 11102,
    "productCode": "PD",
    "productName": "Pen Drive",
    "quantity": 10
}

# Get Item by code
GET -  http://localhost:8200/order/item/getbycode/{productcode}   or http://localhost:8200/order/item/getbycode/CR

Response : 
{
    "id": 11101,
    "productCode": "CR",
    "productName": "Card Reader",
    "quantity": 9
}

# Get Item by product name 

GET -  http://localhost:8200/order/item/getitembyname/{productname}   or  http://localhost:8200/order/item/getitembyname/Pen%20Drive

Response : 
{
    "id": 11102,
    "productCode": "PD",
    "productName": "Pen Drive",
    "quantity": 10
}

# update Item Object
PUT -  http://localhost:8200/order/item/update

Request Json : 
	  {
		"id": 11101,
		"quantity": 9
	  }
