conn = new Mongo();
db = conn.getDB("test");
db.createUser({
    user: "user",
    pwd: "password123",
    roles: [{role: "readWrite", db: "test"}]
})