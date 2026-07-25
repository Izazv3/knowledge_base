const https = require("https");

async function getTemperature(name) {
  const url = `https://jsonmock.hackerrank.com/api/weather?name=${name}`;

  return new Promise((resolve, reject) => {
    https
      .get(url, (res) => {
        let data = "";

        res.on("data", (chunk) => (data += chunk));
        res.on("end", () => {
          const json = JSON.parse(data);

          if (json.data.length > 0) {
            resolve(json.data[0].weather.split(" ")[0]);
          } else {
            resolve("Data not found!");
          }
        });
      })
      .on("error", reject);
  });

  //   const response = await fetch(url);

  //   const json = await response.json();

  //   if (json.data.length > 0) {
  //     return parseInt(json.data[0].weather);
  //   }

  //   return null;
}

async function main() {
  const result = await getTemperature("Dallas");
  console.log(result);
}

main();

// to run cd to this file and run : node weather_api.js
