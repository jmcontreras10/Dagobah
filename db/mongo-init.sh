sudo apt-get update
sudo apt-get install nodejs -y
sudo apt-get install npm -y
npm install
node init-mongo-data.js localhost:27018 mongodb://mongo:password@localhost:27018/dagobah