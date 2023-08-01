import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter } from 'react-router-dom'
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

import Batman from "C:/work/dogs_life_p1/superheroes-ui/src/images/1.jpeg";
import Superman from "C:/work/dogs_life_p1/superheroes-ui/src/images/2.jpeg";
import GreenLantern from "C:/work/dogs_life_p1/superheroes-ui/src/images/4.jpeg";
import TheHuntress from "C:/work/dogs_life_p1/superheroes-ui/src/images/5.jpeg";
import TheFlash from "C:/work/dogs_life_p1/superheroes-ui/src/images/3.jpeg";
import HarleyQuinn from "C:/work/dogs_life_p1/superheroes-ui/src/images/6.jpeg";
import Deadshot from "C:/work/dogs_life_p1/superheroes-ui/src/images/7.jpeg";
import CountVertigo from "C:/work/dogs_life_p1/superheroes-ui/src/images/8.jpeg";
import Robin from "C:/work/dogs_life_p1/superheroes-ui/src/images/9.jpeg";
import Nightwing from "C:/work/dogs_life_p1/superheroes-ui/src/images/10.jpeg";

const images = {
      Batman,
          Superman,
              GreenLantern,
                  TheHuntress,
                      TheFlash,
                          HarleyQuinn,
                              Deadshot,
                                  CountVertigo,
                                      Robin,
                                          Nightwing}
                                          export default images;



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
