const express = require('express');
const path = require('path');

const app = express();
const PORT = process.env.PORT || 8080;

app.use(express.static(path.join(__dirname, 'dist/angularpp')));

app.get('/*', (req, res) => {
  res.sendFile(path.join(__dirname, 'dist/angularpp/browser/index.html'));
});

app.listen(PORT, () => {
  console.log(`Servidor corriendo en puerto ${PORT}`);
});