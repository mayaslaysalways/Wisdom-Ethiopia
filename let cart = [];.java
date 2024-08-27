// Example course data (could be loaded from a JSON file or API in a real application)
const courses = [
    {
        title: 'Web Development',
        description: 'Learn the basics of HTML, CSS, and JavaScript.',
        image: 'images/web-development.jpg',
        price: '$49.99'
    },
    {
        title: 'Data Science',
        description: 'Introduction to data analysis and machine learning.',
        image: 'images/data-science.jpg',
        price: '$59.99'
    },
    {
        title: 'Graphic Design',
        description: 'Master the fundamentals of graphic design.',
        image: 'images/graphic-design.jpg',
        price: '$39.99'
    }
];

function displayCourses() {
    const courseList = document.querySelector('.course-list');
    courseList.innerHTML = '';

    courses.forEach(course => {
        const courseElement = document.createElement('div');
        courseElement.classList.add('course');

        courseElement.innerHTML = `
            <img src="${course.image}" alt="${course.title}">
            <h3>${course.title}</h3>
            <p>${course.description}</p>
            <p><strong>${course.price}</strong></p>
            <button onclick="enrollCourse('${course.title}')">Enroll Now</button>
        `;

        courseList.appendChild(courseElement);
    });
}

function enrollCourse(courseTitle) {
    alert(`You have enrolled in ${courseTitle}!`);
}

document.addEventListener('DOMContentLoaded', displayCourses);
