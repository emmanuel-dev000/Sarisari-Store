import React, { useState, useEffect } from 'react';

const List = () => {
  const [list, setList] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch("http://localhost:8080/products", {
          headers: {
            "Content-Type": "application/json"
          },
          method: "GET"
        });
        const data = await response.json();
        setList(data);
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchData();
  }, []); // Empty dependency array to run effect only once on component mount

  return (
    <div>
      <h1>List Items</h1>
      <ul>
        {list.map(item => (
          <li key={item.id}>{item.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default List;
