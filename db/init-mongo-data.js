const { MongoClient, ServerApiVersion } = require("mongodb");
const exercises = require("./exercises.json");

const uri = process.argv[2];
const client = new MongoClient(uri,  {
        serverApi: {
            version: ServerApiVersion.v1,
            strict: true,
            deprecationErrors: true,
        }
    }
);
async function run() {
    try {
        await client.connect();
        const database = client.db("dagobah");
        const collection = database.collection("exercises");
        await collection.insertMany(exercises);

    } finally {
        await client.close();
    }
}
run().catch(console.dir);