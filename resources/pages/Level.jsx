import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { BASE_URL } from '../configs/constants';
import { fetchAll } from '../services/level_service';

const Level = () => {
  const [niveles, setNiveles] = useState([]);

  useEffect(() => {
    fetchAll()
      .then(response => {
        setNiveles(response);
      })
      .catch(error => {
        console.error('Error en la solicitud:', error);
        // Maneja el error aquí
      });
  }, []);
  

  return (<div>
    <h2>Level </h2>
    <h4>BASE_URL = {BASE_URL}</h4>
    <p>Bienvenido a la página de inicio.</p>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Nombre</th>
          <th>Acciones</th>
        </tr>
      </thead>
      <tbody>
        {niveles.map(nivel => (
          <tr key={nivel.id}>
            <td>{nivel.id}</td>
            <td>{nivel.name}</td>
            <td>XD</td>
          </tr>
        ))}
      </tbody>
    </table>
  </div>);
};

export default Level;