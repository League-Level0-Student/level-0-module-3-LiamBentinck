int bay = 5;
int boy = 255;
int big = 600;
int left = 1;
int right = 1;

void setup() {
  size(600, 600);
}

void draw() {
  background(0, 255, 0);
  fill(255, 0, 0);
  for (int i = 10; i > 0; i--) {
    if (i % 2 == 0) {
      noFill();
    } else {
      noFill();
    }
    ellipse(big, boy, i*30, i*30);
    ellipse(bay, boy, i*30, i*30);
  }
  bay+=left;
  big-=right;
  if (bay>600) {
    left=-1;
  }
  if (big<0) {
    right=-1;
  }
  if(bay<0){
  left=+1;
}
  if(big<600){
    right=+1;
  }
 
}
