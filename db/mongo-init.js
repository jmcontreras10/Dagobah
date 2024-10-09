db = db.getSiblingDB('dagobah');

db.createCollection("exercises");
db.createUser({
    user: 'mongo',
    pwd: 'password',
    roles: [
        {
            role: 'readWrite',
            db: 'dagobah',
        },
    ],
});