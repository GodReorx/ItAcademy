
db.createCollection( 'glasses', {validator: {$jsonSchema: {bsonType: 'object',title:'glasses',properties: {brand: {bsonType: 'string'},frame: {bsonType: 'string'},provider: {bsonType: 'object',
title:'object',properties: {name: {bsonType: 'string'},address: {bsonType: 'object',
title:'object',properties: {street: {bsonType: 'string'},number: {bsonType: 'int'},floor: {bsonType: 'string'},door: {bsonType: 'string'},city: {bsonType: 'string'},postalCode: {bsonType: 'string'},country: {bsonType: 'string'}}},telephone: {bsonType: 'string'},fax: {bsonType: 'string'},nif: {bsonType: 'string'}}},price: {bsonType: 'decimal'},boughtBy: {bsonType: 'array',items: {
title:'object',properties: {name: {bsonType: 'string'},data: {bsonType: 'object',
title:'object',properties: {address: {bsonType: 'string'},telephone: {bsonType: 'string'},email: {bsonType: 'string'},registerDate: {bsonType: 'date'}}}}}}}         }      }});  