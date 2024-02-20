
db.createCollection( 'shops', {validator: {$jsonSchema: {bsonType: 'object',title:'shops',properties: {name: {bsonType: 'string'},order: {bsonType: 'array',items: {
title:'object',properties: {orderId: {bsonType: 'int'},products: {bsonType: 'array',items: {
title:'object',properties: {name: {bsonType: 'string'},quantity: {bsonType: 'string'},price: {bsonType: 'string'},descrip: {bsonType: 'string'},image: {bsonType: 'string'},pizzaCategory: {bsonType: 'string'}}}},total: {bsonType: 'decimal'},client: {bsonType: 'array',items: {
title:'object',properties: {idClient: {bsonType: 'int'},name: {bsonType: 'string'},surname: {bsonType: 'string'},deliverIn: {bsonType: 'object',
title:'object',properties: {street: {bsonType: 'string'},number: {bsonType: 'string'},floor: {bsonType: 'string'},contactNumber: {bsonType: 'string'},note: {bsonType: 'string'}}}}}},type: {bsonType: 'string'},delivered: {bsonType: 'bool'},paid: {bsonType: 'bool'}}}}}         }      }});  