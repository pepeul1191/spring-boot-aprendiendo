import axios from 'axios';
import { BASE_URL } from '../configs/constants';
//import { CSRF } from '../stores/csrf.js';

export const fetchAll = () => {
  return new Promise((resolve, reject) => {
    fetch(`${BASE_URL}level/list`)
      .then(response => {
        if (!response.ok) {
          throw new Error(`Error de red: ${response.status}`);
        }
        return response.json();
      })
      .then(data => {
        resolve(data);
      })
      .catch(error => {
        reject(error);
      });
  });
}
