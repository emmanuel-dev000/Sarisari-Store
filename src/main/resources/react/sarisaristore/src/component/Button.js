import * as React from 'react';
import Button from '@mui/material/Button';

export default function DefaultButton() {
  const onGetAllProductsButtonClick = (e) => {
    
  };
  return (
      <Button 
        variant="contained" 
        onClick={() => { alert('clicked'); }}>
          Get All Products
      </Button>
  );
}