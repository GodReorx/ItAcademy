
db.createCollection( 'client', {validator: {$jsonSchema: {bsonType: 'object',title:'client',properties: {name: {bsonType: 'string'},data: {bsonType: 'object',
title:'object',properties: {address: {bsonType: 'string'},telephone: {bsonType: 'string'},email: {bsonType: 'string'},registerData: {bsonType: 'date'}}},lastShopping: {bsonType: 'array',items: {
title:'object',properties: {boughtdate: {bsonType: 'date'},glasses: {bsonType: 'object',
title:'object',properties: {brand: {bsonType: 'string'},graduationL: {bsonType: 'decimal'},graduationR: {bsonType: 'decimal'},colorGlassL: {bsonType: 'string'},colorGlassR: {bsonType: 'string'},frameType: {bsonType: 'string'},price: {bsonType: 'decimal'}}}}}}}         }      }});  